// Generated by Dagger (https://dagger.dev).
package com.example.zest.dagger;

import com.example.zest.room.general.RoomDB;
import com.example.zest.room.interfaces.CompletePlanDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomModule_ProvidesCompletePlanDaoFactory implements Factory<CompletePlanDao> {
  private final RoomModule module;

  private final Provider<RoomDB> databaseProvider;

  public RoomModule_ProvidesCompletePlanDaoFactory(RoomModule module,
      Provider<RoomDB> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public CompletePlanDao get() {
    return providesCompletePlanDao(module, databaseProvider.get());
  }

  public static RoomModule_ProvidesCompletePlanDaoFactory create(RoomModule module,
      Provider<RoomDB> databaseProvider) {
    return new RoomModule_ProvidesCompletePlanDaoFactory(module, databaseProvider);
  }

  public static CompletePlanDao providesCompletePlanDao(RoomModule instance, RoomDB database) {
    return Preconditions.checkNotNullFromProvides(instance.providesCompletePlanDao(database));
  }
}