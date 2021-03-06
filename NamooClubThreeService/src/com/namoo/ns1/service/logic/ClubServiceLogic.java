package com.namoo.ns1.service.logic;

import java.util.ArrayList;
import java.util.List;

import com.namoo.ns1.data.EntityManager;
import com.namoo.ns1.service.facade.ClubService;
import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.facade.IdGenerator;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
import com.namoo.ns1.service.logic.exception.NamooExceptionFactory;

import dom.entity.Club;
import dom.entity.ClubMember;
import dom.entity.Community;
import dom.entity.SocialPerson;

public class ClubServiceLogic implements ClubService {

	private EntityManager em;
	CommunityService cmservice = NamooClubServiceFactory.getInstance().getCommunityService();
	public ClubServiceLogic() {
		//
		em = EntityManager.getInstance();
	}
	
	@Override
	public void registClub(String cmId, String clubName, String description,
			String adminName, String email, String password) {
		//
		if (em.find(Club.class, clubName) != null) {
			throw NamooExceptionFactory.createRuntime("이미 존재하는 클럽입니다.");
		}
		
		if (em.find(SocialPerson.class, email) != null) {
			throw NamooExceptionFactory.createRuntime("해당 주민이 이미 존재합니다.");
		}

		SocialPerson admin = createPerson(adminName, email, password);
		
		String id = IdGenerator.getNextId(Club.class);
		String cmid = cmId;
		Club club = new Club(cmid, id, clubName, description, admin);
		
		Community community =  cmservice.findCommunity(cmId);
		
		community.getClubs().add(club);
				
		em.store(club);
		em.store(community);
	}

	private SocialPerson createPerson(String name, String email,
			String password) {
		//
		SocialPerson person = new SocialPerson(name, email, password);
		em.store(person);
		
		return person;
	}

	@Override
	public void registClub(String cmId, String category, String clubName, String description, String email) {
		//
		if (em.find(Club.class, clubName) != null) {
			throw NamooExceptionFactory.createRuntime("이미 존재하는 클럽입니다.");
		}
		
		SocialPerson towner = em.find(SocialPerson.class, email);
		if (towner == null) {
			throw NamooExceptionFactory.createRuntime("존재하지 않는 주민입니다.");
		}
		
		
		String id = IdGenerator.getNextId(Club.class);
		String cmid = cmId;
		
		Club club = new Club(cmid, id, category, clubName, description, towner);
		Community community =  cmservice.findCommunity(cmId);
		
		community.addClub(club);
							
		em.store(club);
		em.store(community);
	}

	@Override
	public Club findClub(String clubName) {
		//
		return em.find(Club.class, clubName);
	}

	@Override
	public void joinAsMember(String clubName, String name, String email,
			String password) {
		// 
		Club club = em.find(Club.class, clubName);
		
		if (club == null) {
			throw NamooExceptionFactory.createRuntime("클럽이 존재하지 않습니다.");
		}
	
		if (em.find(SocialPerson.class, email) != null) {
			throw NamooExceptionFactory.createRuntime("해당 주민이 이미 존재합니다.");
		}
		
		SocialPerson towner = createPerson(name, email, password);
		club.addMember(towner);
		
		em.store(club);
	}

	@Override
	public void joinAsMember(String clubName, String email) {
		//
		Club club = em.find(Club.class, clubName);
		
		if (club == null) {
			throw NamooExceptionFactory.createRuntime("클럽이 존재하지 않습니다.");
		}
		
		SocialPerson towner = em.find(SocialPerson.class, email);
		if (towner == null) {
			throw NamooExceptionFactory.createRuntime("존재하지 않는 주민입니다.");
		}
		
		club.addMember(towner);
		em.store(club);
	}

	@Override
	public List<Club> findAllClubs() {
		// 
		return em.findAll(Club.class);
	}

	@Override
	public ClubMember findClubMember(String clubName, String email) {
		//
		Club club = em.find(Club.class, clubName);
		
		if (club == null) {
			throw NamooExceptionFactory.createRuntime("클럽이 존재하지 않습니다.");
		}
		
		for (ClubMember member : club.getMembers()) {
			if (member.getEmail().equals(email)) {
				return member;
			}
		}
		
		return null;
	}

	@Override
	public List<ClubMember> findAllClubMember(String clubName) {
		// 
		Club club = em.find(Club.class, clubName);
		
		if (club == null) {
			throw NamooExceptionFactory.createRuntime("클럽이 존재하지 않습니다.");
		}
		return club.getMembers();
	}

	@Override
	public int countMembers(String clubName) {
		//
		Club club = em.find(Club.class, clubName);
		if (club != null) {
			return club.getMembers().size();
		}
		
		return 0;
	}

	@Override
	public void removeClub(String clubName) {
		//
	
		em.remove(Club.class, clubName);
	}

	@Override
	public List<Club> findBelongClub(String cmId, String email) {
		//
		List<Club> clubs = em.findAll(Club.class);
		if (clubs == null) return null;
		
		List<Club> belongs = new ArrayList<>();
		for (Club club : clubs) {
			if (club.findMember(email) != null&&club.getCmid().equals(cmId)) {
				belongs.add(club);
			}
		}
		return belongs;
	}

	@Override
	public List<Club> findClubsById(String id) {
		// 
		List<Club> Allclubs = em.findAll(Club.class);
		if (Allclubs == null) return null;
		
		List<Club> clubs = new ArrayList<>();
		for (Club club : Allclubs) {
			if (club.getCmid().equals(id)) {
				clubs.add(club);
			}
		}
		return clubs;
	}
	
	@Override
	public List<Club> findManagedClub(String cmId, String email) {
		//
		List<Club> clubs = em.findAll(Club.class);
		if (clubs == null) return null;
		
		List<Club> manages = new ArrayList<>();
		for (Club club : clubs) {
			if (club.getManager().getEmail().equals(email)&&club.getCmid().equals(cmId)) {
				manages.add(club);
			}
		}
		return manages;
	}

	@Override
	public void withdrawalClub(String clubName, String email) {
		//
		Club club = em.find(Club.class, clubName);
		if (club == null) {
			throw NamooExceptionFactory.createRuntime("클럽이 존재하지 않습니다.");
		}
		
		club.removeMember(email);
		em.store(club);
	}
}
