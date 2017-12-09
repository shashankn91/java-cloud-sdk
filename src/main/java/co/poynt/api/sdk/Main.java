package co.poynt.api.sdk;

import co.poynt.api.model.Business;

public class Main {
	public static void main(String[] args) {
		final String storeDeviceId = "urn:tid:532bc436-9788-3428-81a3-e2f627b1ca16";
		PoyntSdk sdk = PoyntSdk.builder().configure("config.properties").build();

		System.out.println("============= BUSINESS");
		Business business = sdk.business().getByStoreDeviceId(storeDeviceId);
		System.out.println(business);
		System.out.println("=============Done!");
	}
}
