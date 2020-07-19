package builder.zhenya;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());

        Website webite = director.buildWebsite();

        System.out.println(webite);

    }
}
