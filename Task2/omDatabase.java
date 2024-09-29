package Task2;
	import java.util.*;

	class omDatabase {

	    private ArrayList<Om> omx;
	    private int nextId;

	    public omDatabase() {
	        this.omx = new ArrayList<>();
	        this.nextId = 0;
	      }

	    // Create
	    public void addOm(String name, String email, String phoneno) {
	        Om om = new Om(++nextId, name, email, phoneno);
	        omx.add(om);
	        System.out.println("ID: " + nextId + om);

	    }

	    // Read
	    public Om getOm(int id) {
	        for (Om om : omx) {
	            if (om.getId() == id) {
	                return om;
	            }
	        }
	        return null;
	    }

	    public List<Om> getAllOm() {     // sara data show karna
	        return new ArrayList<>(omx);
	    }

	    // Update
	    public boolean updateOm(int id, String name, String email, String phoneno) {
	        Om om = getOm(id);
	        if (om != null) {
	            om.setName(name);
	            om.setEmail(email);
	            om.setPhoneno(phoneno);
	            System.out.println("Updated: " + om);
	            return true;
	        }
	        return false;
	    }

	    // Delete
	    public boolean deleteOm(int id) {
	        Om om = getOm(id);
	        if (om != null) {
	            omx.remove(om);
	            System.out.println("Deleted: " + om);
	            return true;

	        }

	        return false;
	    }

	}

