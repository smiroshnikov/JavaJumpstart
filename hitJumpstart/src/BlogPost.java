import java.util.Date;

/**
 * Created by miross1 on 12/22/2016.
 */
public class BlogPost {
    private String auhor;
    private String title;
    private String body;
    private String category;
    private Date creationDate;

    public BlogPost(String mAuhor, String mTitle, String mBody, String mCategory, Date mCreationDate) {
        this.auhor = mAuhor;
        this.title = mTitle;
        this.body = mBody;
        this.category = mCategory;
        this.creationDate = mCreationDate;
    }

    public String getBody() {
        return body;
    }
}
