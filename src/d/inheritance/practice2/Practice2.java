package d.inheritance.practice2;

class Movie {
    String title;
    double rate;

    public Movie(String title, double rate) {
        this.title = title;
        this.rate = rate;
    }

    public void displayInfo() {
        System.out.print("title: " + title + ", rate: " + rate);
    }
}

class ActionMovie extends Movie{
    String effect;
    public ActionMovie(String title, double rate, String effect) {
        super(title, rate);
        this.effect = effect;
    }

    @Override
    public void displayInfo () {
        System.out.print("[액션]");
        super.displayInfo();
        specialEffects();
    }

    public void specialEffects () {
        System.out.println(effect);
    }
}

class Comedy extends Movie {
    String humor;

    public Comedy(String title, double rate, String humor) {
        super(title, rate);
        this.humor = humor;
    }

    @Override
    public void displayInfo () {
        System.out.print("[코미디]");
        super.displayInfo();
        humorStyle();
    }

    public void humorStyle() {
        System.out.println(humor);
    }
}

class Drama extends Movie {
    String drama;
    public Drama(String title, double rate, String drama) {
        super(title, rate);
        this.drama = drama;
    }

    @Override
    public void displayInfo () {
        System.out.print("[드라마]");
        super.displayInfo();
        System.out.println(drama);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Movie[] movies = {
                new ActionMovie("어벤져스", 4.5, "최고급 CG"),
                new Comedy("극한직업", 4.7, "상황 코미디"),
                new Drama("기생충", 4.9, "계급 갈등")
        };

        for (Movie movie : movies) {
            movie.displayInfo();
        }
    }
}
