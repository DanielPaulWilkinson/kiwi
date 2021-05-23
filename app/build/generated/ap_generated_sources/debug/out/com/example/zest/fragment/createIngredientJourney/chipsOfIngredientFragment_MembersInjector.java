// Generated by Dagger (https://dagger.dev).
package com.example.zest.fragment.createIngredientJourney;

import com.example.zest.async.FixedThreadPool;
import com.example.zest.services.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class chipsOfIngredientFragment_MembersInjector implements MembersInjector<chipsOfIngredientFragment> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<FixedThreadPool> fixedThreadPoolProvider;

  public chipsOfIngredientFragment_MembersInjector(
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<FixedThreadPool> fixedThreadPoolProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.fixedThreadPoolProvider = fixedThreadPoolProvider;
  }

  public static MembersInjector<chipsOfIngredientFragment> create(
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<FixedThreadPool> fixedThreadPoolProvider) {
    return new chipsOfIngredientFragment_MembersInjector(sharedPreferencesProvider, fixedThreadPoolProvider);
  }

  @Override
  public void injectMembers(chipsOfIngredientFragment instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectFixedThreadPool(instance, fixedThreadPoolProvider.get());
  }

  @InjectedFieldSignature("com.example.zest.fragment.createIngredientJourney.chipsOfIngredientFragment.sharedPreferences")
  public static void injectSharedPreferences(chipsOfIngredientFragment instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.example.zest.fragment.createIngredientJourney.chipsOfIngredientFragment.fixedThreadPool")
  public static void injectFixedThreadPool(chipsOfIngredientFragment instance,
      FixedThreadPool fixedThreadPool) {
    instance.fixedThreadPool = fixedThreadPool;
  }
}