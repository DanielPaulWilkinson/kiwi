// Generated by Dagger (https://dagger.dev).
package com.example.zest.fragment.createMealJourney;

import com.example.zest.services.ImageProcessing;
import com.example.zest.services.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class mealImageFragment_MembersInjector implements MembersInjector<mealImageFragment> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<ImageProcessing> imageProcessingProvider;

  public mealImageFragment_MembersInjector(Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<ImageProcessing> imageProcessingProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.imageProcessingProvider = imageProcessingProvider;
  }

  public static MembersInjector<mealImageFragment> create(
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<ImageProcessing> imageProcessingProvider) {
    return new mealImageFragment_MembersInjector(sharedPreferencesProvider, imageProcessingProvider);
  }

  @Override
  public void injectMembers(mealImageFragment instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectImageProcessing(instance, imageProcessingProvider.get());
  }

  @InjectedFieldSignature("com.example.zest.fragment.createMealJourney.mealImageFragment.sharedPreferences")
  public static void injectSharedPreferences(mealImageFragment instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.example.zest.fragment.createMealJourney.mealImageFragment.imageProcessing")
  public static void injectImageProcessing(mealImageFragment instance,
      ImageProcessing imageProcessing) {
    instance.imageProcessing = imageProcessing;
  }
}