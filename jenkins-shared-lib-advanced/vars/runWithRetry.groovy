def call(int times = 3, Closure block) {
    def attempt = 0
    while (attempt < times) {
        try {
            attempt++
            block()
            break
        } catch (Exception e) {
            echo "⚠️ Attempt ${attempt} failed: ${e.message}"
            if (attempt == times) {
                error("❌ All ${times} attempts failed.")
            }
        }
    }
}
