package info.everybodylies.enthuware;

public class InnerClassMemeberFromOuter {
    private static OuterWorld outerWorld = new OuterWorld();

    public static void main(String[] args) {
        outerWorld.m();
    }
}

class OuterWorld {
    private InnerPeace i = new InnerPeace();

    void m() {
        System.out.println(i.reason);
    }

    private class InnerPeace {
        private String reason = "none";
    }
}
