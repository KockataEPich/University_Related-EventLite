package uk.ac.man.cs.eventlite.dao;

import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import uk.ac.man.cs.eventlite.entities.Venue;

@Service
public class VenueServiceImpl implements VenueService {
	
	@Autowired
	private VenueRepository venueRepository;

//	private final static Logger log = LoggerFactory.getLogger(VenueServiceImpl.class);
//
//	private final static String DATA = "data/venues.json";

	@Override
	public long count() {
//		long count = 0;
//		Iterator<Venue> i = findAll().iterator();
//
//		for (; i.hasNext(); count++) {
//			i.next();
//		}
//
//		return count;
		return venueRepository.count();
	}

	@Override
	public Iterable<Venue> findAll() {
//		Iterable<Venue> venues;
//
//		try {
//			ObjectMapper mapper = new ObjectMapper();
//			InputStream in = new ClassPathResource(DATA).getInputStream();
//
//			venues = mapper.readValue(in, mapper.getTypeFactory().constructCollectionType(List.class, Venue.class));
//		} catch (Exception e) {
//			// If we can't read the file, then the event list is empty...
//			log.error("Exception while reading file '" + DATA + "': " + e);
//			venues = Collections.emptyList();
//		}
//
//		return venues;
		return venueRepository.findAll();
	}
//	
//	@Override
//	public <S extends Venue> Iterable<S> saveAll(Iterable<S> entities) {
//		return venue.Repository.saveAll(entities);
//	}

	@Override
	public Venue save(Venue venue) {
		// TODO Auto-generated method stub
		return venueRepository.save(venue);
	}
	
}