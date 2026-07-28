package academy.DevWebber.letsgojava.javacore.Dconstrutores.Test;

import academy.DevWebber.letsgojava.javacore.Dconstrutores.Domain.Anime;

public class AnimeTest001 {
    static void main() {
        Anime anime = new Anime("Bleach 2", "TV", 122, "Ação");
        Anime anime2 = new Anime();
        anime.imprimi();
        anime2.imprimi();
    }
}
