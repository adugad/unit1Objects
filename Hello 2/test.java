import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://images.nationalgeographic.com/wpf/media-live/photos/000/093/cache/calla-lily-detail_9366_600x450.jpg");
        JOptionPane.showMessageDialog(null, "YaY", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
    }