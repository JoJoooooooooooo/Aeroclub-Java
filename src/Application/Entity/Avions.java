package Application.Entity;

public class Avions {
        private int numAvions;
        private String types;
        private double tauxDouble;
        private double forfait1;
        private double forfait2;
        private double forfait3;
        private double reductionSemaine;
        private String immatriculation;
        private String image;
        private String name;
        private String description;
        private double heure_forfait1;
        private double heure_forfait2;
        private double heure_forfait3;
        
        public Avions(int numAvions, String types, double tauxDouble, double forfait1, double forfait2, double forfait3, double heure_forfait1, double heure_forfait2, double heure_forfait3, double reductionSemaine, String immatriculation, String image, String name, String description) {
            this.numAvions = numAvions;
            this.types = types;
            this.tauxDouble = tauxDouble;
            this.forfait1 = forfait1;
            this.forfait2 = forfait2;
            this.forfait3 = forfait3;
            this.heure_forfait1 = heure_forfait1;
            this.heure_forfait2 = heure_forfait2;
            this.heure_forfait3 = heure_forfait3;
            this.reductionSemaine = reductionSemaine;
            this.immatriculation = immatriculation;
            this.image = image;
            this.name = name;
            this.description = description;
        }
        
        // Getters and setters for all attributes
        
        public int getNumAvions() {
            return numAvions;
        }
    
        public void setNumAvions(int numAvions) {
            this.numAvions = numAvions;
        }
    
        public String getTypes() {
            return types;
        }
    
        public void setTypes(String types) {
            this.types = types;
        }
    
        public double getTauxDouble() {
            return tauxDouble;
        }
    
        public void setTauxDouble(double tauxDouble) {
            this.tauxDouble = tauxDouble;
        }
    
        public double getForfait1() {
            return forfait1;
        }
    
        public void setForfait1(double forfait1) {
            this.forfait1 = forfait1;
        }
    
        public double getForfait2() {
            return forfait2;
        }
    
        public void setForfait2(double forfait2) {
            this.forfait2 = forfait2;
        }
    
        public double getForfait3() {
            return forfait3;
        }
    
        public void setForfait3(double forfait3) {
            this.forfait3 = forfait3;
        }
        
        public double getHeureForfait1(){
            return heure_forfait1;
        }
        
        public void setHeureForfait1(double heure_forfait1){
            this.heure_forfait1 = heure_forfait1;
        }
        
        public double getHeureForfait2(){
            return heure_forfait2;
        }
        
        public void setHeureForfait2(double heure_forfait2){
            this.heure_forfait2 = heure_forfait2;
        }
        
        public double getHeureForfait3(){
            return heure_forfait3;
        }
        
        public void setHeureForfait3(double heure_forfait3){
            this.heure_forfait3 = heure_forfait3;
        }
    
        public double getReductionSemaine() {
            return reductionSemaine;
        }
    
        public void setReductionSemaine(double reductionSemaine) {
            this.reductionSemaine = reductionSemaine;
        }
    
        public String getImmatriculation() {
            return immatriculation;
        }
    
        public void setImmatriculation(String immatriculation) {
            this.immatriculation = immatriculation;
        }
    
        public String getImage() {
            return image;
        }
    
        public void setImage(String image) {
            this.image = image;
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
    } 
