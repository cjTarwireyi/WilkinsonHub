package runningshop.assignment6.factories.shop;

import runningshop.assignment6.domain.address.AddressVO;
import runningshop.assignment6.domain.shop.Supplier;

/**
 * Created by Siraaj on 04/17/2016.
 */
public class SupplierFactory {
    public static Supplier getSupplier(String supplierID,String supplierName,AddressVO address){
        return new Supplier.BuilderSupplier()
                .supplierID(supplierID)
                .supplierName(supplierName)
                .supplierAddress(address)
                .build();
    }
}
