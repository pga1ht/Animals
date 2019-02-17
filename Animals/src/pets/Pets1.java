package pets;

public class Pets1 {
	
	private String name;
	private String breed;
	private String species;
	
	
	public Pets1(String name, String breed, String species) {
		super();
		this.name = name;
		this.breed = breed;
		this.species = species;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Pets1 [name=" + name + ", breed=" + breed + ", species=" + species + "]";
	}

}
