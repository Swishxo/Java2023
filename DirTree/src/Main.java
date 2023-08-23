import java.io.File;


public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\Stephon\\Desktop\\JAVA";

        File[] file = new File(path).listFiles();
        tree(file, 0);
    }

    public static void tree(File[] files, int depth)
    {
        for (File filename : files) {

            if (filename.isDirectory()) {
                System.out.println(spacesForDepth(depth) + " Dir-> " + filename.getName());
                tree(filename.listFiles(), depth + 1);
            }

            else {

                System.out.println(spacesForDepth(depth) + " -- " + filename.getName());
            }
        }
    }

    public static String spacesForDepth(int depth) {
        StringBuilder builder = new StringBuilder();
        for(int i =0; i < depth; i++) {
            builder.append("    ");
        }
        return builder.toString();
    }


}

