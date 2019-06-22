package mockTest;

import java.io.File;

import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystemException;
import org.apache.commons.vfs.FileSystemOptions;
import org.apache.commons.vfs.Selectors;
import org.apache.commons.vfs.impl.StandardFileSystemManager;
import org.apache.commons.vfs.provider.sftp.SftpFileSystemConfigBuilder;

public class SftpTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			StandardFileSystemManager manager = new StandardFileSystemManager();
			FileSystemOptions opts = new FileSystemOptions(); 
			SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");
			manager.init();
			String sftpRemoteUrl ="sftp://:subodh:subodh@10.1.21.199";//remote sftp
			FileObject appFolder = manager.resolveFile(sftpRemoteUrl+ "",opts);
			
			if (appFolder.isReadable())
			{
//				bcBean.setFtpVendorLogin(true);
				FileObject[] children = appFolder.getChildren();
				if(children.length>=1)
				{
					for ( int i = 0; i < children.length; i++ )
					{
						String fileName = children[ i ].getName().getBaseName();
						
						File f = new File("E:/localDir/"+fileName);
						
						if(!f.exists())
						{
							try
							{
								FileObject localFileObject = manager.resolveFile("E:/localDir/"+fileName, opts);
								FileObject remoteFileObject = manager.resolveFile(sftpRemoteUrl+"E:/abhijeet"+"/"+fileName,opts); //error
								localFileObject.copyFrom(remoteFileObject, Selectors.SELECT_SELF);
											
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						}
						
						
					}
				}
			}
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
