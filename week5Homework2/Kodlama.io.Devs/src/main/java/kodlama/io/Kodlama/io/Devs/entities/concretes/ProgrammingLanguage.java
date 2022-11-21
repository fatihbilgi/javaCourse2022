package kodlama.io.Kodlama.io.Devs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "programmingLanguage")
@Getter
@Setter
@AllArgsConstructor // parametreli constructor
@NoArgsConstructor // parametresiz constructor
@Entity // Sen bir veritabanı varlığısın demek.
public class ProgrammingLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Id otomatik artan
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "programmingLanguage")
	private List<Technology> technologies;

}
