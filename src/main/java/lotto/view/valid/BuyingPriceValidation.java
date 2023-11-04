package lotto.view.valid;

public class BuyingPriceValidation implements InputValidation<Integer> {

    @Override
    public Integer validateInput(final String buyingPriceText, final ViewValidator viewValidator) {
        int buyingPrice = viewValidator.parseInt(buyingPriceText);
        viewValidator.validateMod(buyingPrice);

        return buyingPrice;
    }
}
