package lecture08;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class SaveImageFromURL 
{
	public static void main(String[] args) throws IOException
	{
		String site = "<body id=\"www-wikipedia-org\">"
				+ "<div class=\"central-textlogo\">"
				+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
				+ "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
				+ "</div>"
				+ "</body>";
		
		int startIndex = site.indexOf("<img src=\"");
		startIndex = startIndex + "<img src=\"".length();
		int endIndex = site.indexOf('\"', startIndex);
		String src = site.substring(startIndex, endIndex);
		String downloadUrl= src;
		
		URL url =new URL(downloadUrl);
		BufferedImage image=ImageIO.read(url);
		ImageIO.write(image, "png", new File("picture.png"));
		
	}
}
