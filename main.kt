import javax.swing.JFrame
import java.awt.Color
import java.awt.Font
import javax.swing.BorderFactory
import javax.swing.JButton
import javax.swing.UIManager

fun main() {
    println("Starting KEngine")
    println("v0.1 EARLY PROTOTYPE")

    try {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel")
        UIManager.put("control", Color(43, 43, 43,))
        UIManager.put("info", Color(43, 43, 43,))
        UIManager.put("nimbusBase", Color(60, 60, 60,))
        UIManager.put("nimbusBlueGray", Color(60, 60, 60,))
        UIManager.put("nimbusFocus", Color(115, 164, 209))
        UIManager.put("text", Color.WHITE)
    } catch (e: Exception) {
        e.printStackTrace()
    }

    val frame = JFrame("KEngine")
    frame.setSize(900, 650)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = null
    frame.setLocationRelativeTo(null)

    val button = JButton("New Project")
    button.background = Color(0, 0, 0)
    button.foreground = Color.white
    button.border = BorderFactory.createEmptyBorder()
    button.isFocusPainted = false
    button.setBounds(10, 10, 185, 50,)

    button.font = try {
        Font("JetBrains Mono", Font.PLAIN, 14)
    } catch (e: Exception) {
        e.printStackTrace()
        Font("Arial", Font.PLAIN, 14)
    }
    button.addActionListener {
        println("Creating new project... (functionality will be added later this is an early prototype.)")
    }

    frame.add(button)
    frame.contentPane.background = Color(43, 43, 43)

    frame.isVisible = true
}
