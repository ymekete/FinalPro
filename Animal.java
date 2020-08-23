import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Animal {
	public String name;
	
	public  Double speciesAge;
	public  String animalSpecies;
        public  Double lifeExpectancy;
       
         SimpleDateFormat birthDate = new SimpleDateFormat("MM-dd-yyyy");
	
	// the constructor for the Animal class
	public Animal(String name,  Double speciesAge, String animalSpecies, Double lifeExpectancy) {
		this.name = name;
		this.animalSpecies = animalSpecies;
		this.speciesAge = speciesAge;
		this.birthDate = birthDate;
                this.lifeExpectancy= lifeExpectancy;
                
	}
        
    
	
	// getter/accessor method for name
	public String getName() {
		return name;
	}
	
	// setter/mutator method for name
	public void setName(String name) {
		this.name = name;
	}
	
	// getter/accessor method for species
	public String getSpecies() {
		return animalSpecies;
	}
	
	// setter/mutator method for species
	public void setSpecies(String species) {
		this.animalSpecies = species;
	}
	
	// getter/accessor method for status
	public Double getAge() {
		return speciesAge;
	}
	
	// setter/mutator method for status
	public void setAge(String animalSpecies, Double age) {
		this.speciesAge = age;
	}
	
	// getter/accessor method for date of birth
	public SimpleDateFormat getDOB() {
		return BirthDate;
	}

	// setter/mutator method for date of birth
	public void setDOB(SimpleDateFormat BD) {
		this.BirthDate = BD;
	}
        
        public Double lifeExpectancy() {
		return lifeExpectancy;
	}

	// setter/mutator method for date of birth
	public void setlifeExpectancy(Double LE) {
		this.lifeExpectancy = LE;
	}
        
        public void calculateLifeExpectancy(){
            
                
                 
             
             
            
        }
        
        

	// the toString method which gets a string representation of the Animal
	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", status="
				+ status + ", DOB=" + DOB + "]";
	}
        
        
            
            
            
        
        
        
}
