import java.io.*;
public class SerializeDemo {
 public static void main(String [] args) {
        Project e = new Project ();
        e.setId(1);
        e.setTittle("women empowerment");
        e.setTeamLeadName("Yaswanth");
        e.setDuration("five hours");
        e.setClientName("yash");
        e.setLabNbr(28);
        e.setTeamSize(5); 

        serialize(e);

        deserialize();
    }

    private static void deserialize() {
        Project e;
        try {
            FileInputStream fileIn = new FileInputStream("./Project.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Project) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Project class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Project...");
        System.out.println("Name: " + e.getId());
        System.out.println("Tittle: " +  e.getTittle ());
        System.out.println("TeamleadName: " + e. getTeamLeadName ());
        System.out.println("Duration: " + e. getDuration ());
        System.out.println("ClientName: " + e. getClientName ());
        System.out.println("Labnumber: " + e. getLabNbr ());
        System.out.println("teamsize: " + e. getTeamSize ());
    }

    private static void serialize(Project e) {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("./Project.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/Project.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    static class Project implements  Serializable{

        private int id;
        private String tittle;
        private String teamleadname;
        private String duration;
        private String clientname;
        private int labnbr;
        private int teamsize;

        public int getId() {
            return id;
        }
		public void setId(int id) {
            this.id = id;
        }

        public String getTittle () {
            return tittle;
        }

        public void setTittle (String tittle) {
            this. tittle = tittle;
        }

        public String getTeamLeadName() {
            return teamleadname;
        }

        public void setTeamLeadName (String teamleadname) {
            this. teamleadname = teamleadname;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this. duration = duration;
        }

        public String   getClientName () {
            return clientname;
        }

        public String   setClientName(String clientname) {
            return this. clientname = clientname;
        }   
        public int getLabNbr() {
            return labnbr;
        }

        public void setLabNbr (int labnbr) {
            this. labnbr = labnbr;
        }
        public int getTeamSize() {
            return teamsize;
        }

        public void setTeamSize (int teamsize) {
            this. teamsize = teamsize;
        }
          
    }
}