package ca.ucalgary.ensf380;

public class Novel extends Fiction {
    public Novel() {
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Novel";
    }

	@Override
	public String genre() {
		// TODO Auto-generated method stub
		return null;
	}
}
