package com.capgemini.assetmanagement.repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.capgemini.assetmanagement.beans.AssetBean;
public class AssetRepository {
	
    public List<HashMap<String, Object>> assetTable() {

			List<HashMap<String, Object>> assetsArrayList = new ArrayList<HashMap<String, Object>>();

			HashMap<String, Object> assetHashMap1 = new HashMap<String, Object>();
			AssetBean asset1 = new AssetBean(1, "Dell", "laptop", 100, 50000);
			assetHashMap1.put("AssetId", asset1.getAssetId());
			assetHashMap1.put("Title", asset1.getTitle());
			assetHashMap1.put("Category", asset1.getCategory());
			assetHashMap1.put("Quantity", asset1.getQuantity());
			assetHashMap1.put("Price per Unit", asset1.getPrice());
			assetsArrayList.add(assetHashMap1);

			HashMap<String, Object> assetHashMap2 = new HashMap<String, Object>();
			AssetBean asset2 = new AssetBean(2, "Hp", "laptop", 50, 30000);
			assetHashMap2.put("Title", asset2.getTitle());
			assetHashMap2.put("Category", asset2.getCategory());
			assetHashMap2.put("Quantity", asset2.getQuantity());
			assetHashMap2.put("Price per Unit", asset2.getPrice());

			assetsArrayList.add(assetHashMap2);

			HashMap<String, Object> assetHashMap3 = new HashMap<String, Object>();
			AssetBean asset3 = new AssetBean(3, "Lenovo", "laptop", 10, 25000);
			assetHashMap3.put("AssetId", asset3.getAssetId());
			assetHashMap3.put("Title", asset3.getTitle());
			assetHashMap3.put("Category", asset3.getCategory());
			assetHashMap3.put("Quantity", asset3.getQuantity());
			assetHashMap3.put("Price per Unit", asset3.getPrice());

			assetsArrayList.add(assetHashMap3);

			HashMap<String, Object> assetHashMap4 = new HashMap<String, Object>();
			AssetBean asset4 = new AssetBean(4, "Mac", "laptop", 7, 70000);
			assetHashMap4.put("AssetId", asset4.getAssetId());
			assetHashMap4.put("Title", asset4.getTitle());
			assetHashMap4.put("Category", asset4.getCategory());
			assetHashMap4.put("Quantity", asset4.getQuantity());
			assetHashMap4.put("Price", asset4.getPrice());

			assetsArrayList.add(assetHashMap4);

			HashMap<String, Object> assetHashMap5 = new HashMap<String, Object>();
			AssetBean asset5 = new AssetBean(5, "Acer", "laptop", 11, 27000);
			assetHashMap5.put("AssetId", asset5.getAssetId());
			assetHashMap5.put("Title", asset5.getTitle());
			assetHashMap5.put("Category", asset5.getCategory());
			assetHashMap5.put("Quantity", asset5.getQuantity());
			assetHashMap5.put("Price", asset5.getPrice());

			assetsArrayList.add(assetHashMap5);

			return assetsArrayList;

		}

	}


