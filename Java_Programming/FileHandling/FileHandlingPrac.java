import java.io.File;
 class FilesAndFolders{
	public static void main (String[] args) throws Exception{
		File fh = new File("C:/Users/Acer/Desktop/FileHandling","xyz.text");
		System.out.println("file objcet created");
		System.out.println(fh.createNewFile());
		System.out.println(fh.getName());
		System.out.println(fh.getAbsolutePath());
		System.out.println(fh.getParent());
		System.out.println(fh.getParentFile());
		System.out.println(fh.getPath());
		System.out.println(fh.isAbsolute());
		System.out.println(fh.getAbsoluteFile());
		System.out.println(fh.getCanonicalPath());
		System.out.println(fh.getCanonicalFile());
		System.out.println(fh.canRead());
		System.out.println(fh.canWrite());
		System.out.println(fh.exists());
		System.out.println(fh.isDirectory());
		System.out.println(fh.isFile());
		System.out.println(fh.isHidden());
		System.out.println(fh.lastModified());
		System.out.println(fh.delete());






	}
}