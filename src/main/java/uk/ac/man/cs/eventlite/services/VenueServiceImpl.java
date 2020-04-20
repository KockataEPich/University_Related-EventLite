package uk.ac.man.cs.eventlite.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.man.cs.eventlite.dao.VenueRepository;
import uk.ac.man.cs.eventlite.entities.Event;
import uk.ac.man.cs.eventlite.entities.Venue;

@Service
public class VenueServiceImpl implements VenueService {
	
	@Autowired
	private VenueRepository venueRepository;

	@Override
	public long count() {
		return venueRepository.count();
	}
	
	@Override
	public Optional<Venue> findById(long id) {
		return venueRepository.findById(id);
	}
	
	@Override
	public Venue findOne(long id) {
		return findById(id).orElse(null);
	}

	@Override
	public Iterable<Venue> findAll() {
		return venueRepository.findByOrderByName();
	}
	
	@Override
	public Iterable<Venue> findByName(String name) {
		return venueRepository.findAllByName(name);
	}
	
	@Override
	public Iterable<Venue> findByNameContaining(String name) {
		return venueRepository.findAllByNameContainingIgnoreCaseOrderByName(name);
	}

	@Override
	public Venue save(Venue venue) {
		return venueRepository.save(venue);
	}
	
}
