package com.arturogutierrez.openticator.storage.realm.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class CategoryRealm extends RealmObject {

  @PrimaryKey
  private String categoryId;
  private String name;
  private RealmList<AccountRealm> accounts;

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RealmList<AccountRealm> getAccounts() {
    return accounts;
  }

  public void setAccounts(RealmList<AccountRealm> accounts) {
    this.accounts = accounts;
  }
}
