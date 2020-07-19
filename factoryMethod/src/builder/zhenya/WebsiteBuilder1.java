package builder.zhenya;

public class WebsiteBuilder {
    public static void main(String[] args) {
        Website website = new Website();
        website.setName("VisitCard");
        website.setCms("Word pree");
        website.setPrice(500);

        System.out.println(website);

    }
}
