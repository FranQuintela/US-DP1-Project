
package acme.entities.offers;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Offer extends DomainEntity {

	//Serialisation identifier
	private static final long	serialVersionUID	= 1L;

	//Atributes

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				creationMoment;

	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date				deadline;

	@NotBlank
	private String				description;

	@NotNull
	private Integer				salaryRange; // Hay que cambiarlo

	@NotBlank
	private String				ticker;		// Hay que cambiarlo

}
