package StructuralPatterns.Adapter;

import StructuralPatterns.Adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
