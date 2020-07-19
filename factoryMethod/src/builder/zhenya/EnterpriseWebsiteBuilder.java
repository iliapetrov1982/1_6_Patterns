package builder.zhenya;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprice website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
