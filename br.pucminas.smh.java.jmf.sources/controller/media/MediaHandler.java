package controller.media;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import model.media.Media;


public class MediaHandler
{

	private static final String mediaPath = "./resources/";
	private ArrayList<Media> mediaContent = new ArrayList<Media>();
	
	public MediaHandler()
	{
		searchFolders(mediaPath);
	}
	
	public void searchFolders(String path){
		File f = new File (path);
		File[] subFolders = f.listFiles();
		
		for (File file : subFolders){
			if (file.isDirectory())
			{
				searchFolders(file.getPath());
			}
			else
			{
				
				try
				{
					Media newMedia = new Media();
					newMedia.setName(file.getName());
					newMedia.setPath(file.getCanonicalPath());
					newMedia.setType(file.getParentFile().getName());
					mediaContent.add(newMedia);
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	
	public Media getMedia(int pos){
		return mediaContent.get(pos);
	}
	
	public Media getMedia()
	{
		return mediaContent.get(0);
	}
}
