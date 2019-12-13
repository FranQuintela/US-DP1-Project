
package acme.features.authenticated.authenticated;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedAuthenticatedListService implements AbstractListService<Authenticated, Authenticated> {

	@Autowired
	AuthenticatedAuthenticatedRepository repository;


	@Override
	public Collection<Authenticated> findMany(final Request<Authenticated> request) {
		assert request != null;

		Collection<Authenticated> result;
		int id = request.getModel().getInteger("messageThreadId");
		result = this.repository.findManyAuthenticatedByMessageThreadId(id);
		//result = this.repository.findManyMessageThreads();

		return result;
	}

	@Override
	public void unbind(final Request<Authenticated> request, final Authenticated entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model);
	}
	@Override
	public boolean authorise(final Request<Authenticated> request) {
		assert request != null;
		return true;
	}
}