package uniAdmission;

public class AdmissionForm {

	public static void main(String[] args) {
		UniversityAdmission u = new UniversityAdmission("Amti", 34, 32, 324235, 32);

		try {
			u.validateForm();
		} catch (EmptyNameException e) {
			System.out.println(e);
		} catch (UnderageException e) {
			System.out.println(e);
		} catch (InvalidPercentageException e) {
			System.out.println(e);
		} catch (FeesNotPaidException e) {
			System.out.println(e);
		} catch (InsufficientFeesException e) {
			System.out.println(e);
		} catch (NotFitForAdmission e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
