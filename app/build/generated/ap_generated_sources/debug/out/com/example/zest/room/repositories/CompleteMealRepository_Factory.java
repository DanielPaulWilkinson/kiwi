// Generated by Dagger (https://dagger.dev).
package com.example.zest.room.repositories;

import com.example.zest.room.interfaces.CompleteMealDao;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CompleteMealRepository_Factory implements Factory<CompleteMealRepository> {
  private final Provider<CompleteMealDao> completeMealDaoProvider;

  public CompleteMealRepository_Factory(Provider<CompleteMealDao> completeMealDaoProvider) {
    this.completeMealDaoProvider = completeMealDaoProvider;
  }

  @Override
  public CompleteMealRepository get() {
    return newInstance(completeMealDaoProvider.get());
  }

  public static CompleteMealRepository_Factory create(
      Provider<CompleteMealDao> completeMealDaoProvider) {
    return new CompleteMealRepository_Factory(completeMealDaoProvider);
  }

  public static CompleteMealRepository newInstance(CompleteMealDao completeMealDao) {
    return new CompleteMealRepository(completeMealDao);
  }
}
