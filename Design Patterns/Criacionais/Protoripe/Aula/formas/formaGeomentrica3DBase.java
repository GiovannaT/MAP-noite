public class formaGeomentrica3DBase implements Cloneable {
    private float peso;
    private float area;
    public int vertices;
    public int arestas;
    public int lados;

    formaGeomentrica3DBase getClone() {
        try {
            return (formaGeomentrica3DBase) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println (" Não foi possivel clonar. " );
            return this;
        }
    }

    public formaGeomentrica3DBase(float peso, float area, int vertices, int arestas, int lados) {
        this.peso = peso;
        this.area = area;
        this.vertices = vertices;
        this.arestas = arestas;
        this.lados = lados;
    }
}