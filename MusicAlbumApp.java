//MusicAlbumApp.java

package albums;
import com.gmail.vmableka.MusicAlbum;
import javax.swing.JOptionPane;

public class MusicAlbumApp{
	public static void main(String [] args){
		MusicAlbum album1 = new MusicAlbum("Different World","Alan Walker",1,"Faded", 4.00);
		String content = album1.toString();

		JOptionPane.showMessageDialog(null, content, "Album Info", 1);
		System.exit(0);

		//System.out.println(content);
	}
}
