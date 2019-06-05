public class Cachorro extends Animal {
    private boolean pelo;

    public boolean isPelo() {
        return pelo;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    public void latir(){
        System.out.println("Au au");
    }

    public Cachorro(boolean pelo) {
        this.pelo = pelo;
    }
}
