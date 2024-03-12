package ma.ac.esi.referentielCompetences.model;

public class Skill {


	
	private String name;
	private int id;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String description;
	 private String domain;
	 private String level;
	 
	 public Skill() {}
	 public Skill(String name, String description, String domain, String
	level) {
	 this.description = description;
	 this.domain = domain;
	 this.level = level;
	 this.name=name;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Skill [name=" + name + ", description=" + description + ", domain=" + domain + ", level=" + level + "]";
	}
	
	

	

}
