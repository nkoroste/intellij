package com.google.idea.sdkcompat.diagnostic;

import com.intellij.diagnostic.VMOptions;
import java.nio.file.Path;
import org.jetbrains.annotations.Nullable;

/**
 * Compat for {@code VMOptions}. {@link VMOptions#getWriteFile} changed its return type from File to
 * Path in 2020.3. #api202
 */
public class VMOptionsCompat {

  private VMOptionsCompat() {}

  // #api202: Method return type changed in 2020.3 from File to Path
  @Nullable
  public static Path getWriteFile() {
    return VMOptions.getWriteFile();
  }
}
