public class Die {
    private int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int throwDie() {
        return (int) (Math.random() * sides) + 1;
    }

    public static void main(String[] args) {
        Die d6 = new Die(6);
        Die d20 = new Die(20);
        Die d100 = new Die(100);

        System.out.println(d6.throwDie());
        System.out.println(d6.throwDie());
        System.out.println(d6.throwDie());
        System.out.println();
        System.out.println(d20.throwDie());
        System.out.println(d20.throwDie());
        System.out.println(d20.throwDie());
        System.out.println();
        System.out.println(d100.throwDie());
        System.out.println(d100.throwDie());
        System.out.println(d100.throwDie());
    }
}
