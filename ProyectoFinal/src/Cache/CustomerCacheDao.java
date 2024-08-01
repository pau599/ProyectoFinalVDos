package Cache;

import Cache.AbstractCacheDao;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class CustomerCacheDao
extends AbstractCacheDao<Cliente, Long> {

	public CustomerCacheDao() {
		super();
		this.cache = new HashMap<Long, Cliente>();
	}

	public CustomerCacheDao(Map<Long, Cliente> cache) {
		super(cache);
	}

	@Override
	public List<Cliente> getAll() {
           return new ArrayList<>(cache.values());
		
	}

	@Override
	public void insert(Cliente element) {
		if (element != null) {
            cache.put(element.getId(), element);
	}
        }

	@Override
	public Cliente getByKey(Long id) {
		return cache.get(id);
		
	}

}