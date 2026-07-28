package academy.DevWebber.letsgojava.javacore.Csobrecargametodos.Test;

import academy.DevWebber.letsgojava.javacore.Csobrecargametodos.Domain.Anime;

public class AnimeTest001 {
    static void main() {
        Anime anime = new Anime();
//        anime.init("Bleach", "TV", 122);
        anime.init("Bleach 2", "TV", 122, "Ação");
        anime.imprimi();
    }
}
