public class TestSquara {
    public static void main(String[] args) {
        Squara squara= new Squara();
        System.out.println(squara);

        squara = new Squara(2.3);
        System.out.println(squara);

        squara = new Squara(5.8, "yellow", true);
        System.out.println(squara);
    }
}
