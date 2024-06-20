public class ValidatorService {

    public void validate(int number) throws NotValidException {
        try {
            if (number < 0) {
                throw new NotValidException("girilen sayı negatif");
            }
            System.out.println("Geçerli sayı: " + number);
        } finally {
            System.out.println("işlem tamamlandı");
        }
    }

    public static void main(String[] args) {
        ValidatorService validatorService = new ValidatorService();

        int[] numbers = {61, -25, 12, -15};

        for (int number : numbers) {
            try {
                validatorService.validate(number);
            } catch (NotValidException e) {
                System.err.println("Hata: " + e.getMessage());
            }
        }
    }
}