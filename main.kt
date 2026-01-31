import javax.swing.JFrame
import java.awt.Color
import java.awt.Font
import javax.swing.BorderFactory
import javax.swing.JButton
import javax.swing.UIManager
import javax.swing.JPanel
import javax.swing.JLabel
import javax.swing.JTextField

fun main() {
    println("Starting KEngine")
    println("v0.2 EARLY PROTOTYPE")

    try {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel")
        UIManager.put("control", Color(43, 43, 43))
        UIManager.put("info", Color(43, 43, 43))
        UIManager.put("nimbusBase", Color(60, 60, 60))
        UIManager.put("nimbusBlueGray", Color(60, 60, 60))
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

    val projectPanel = JPanel()
    projectPanel.layout = null
    projectPanel.setBounds(10, 80, 380, 140)
    projectPanel.isVisible = false
    projectPanel.background = Color(60, 60, 60)

    val nameLabel = JLabel()
    nameLabel.foreground = Color.WHITE
    nameLabel.setBounds(10, 10, 120, 25)
    nameLabel.font = Font("JetBrains Mono", Font.BOLD, 17)
    projectPanel.add(nameLabel)

    val nameLabel2 = JLabel("Project Name:")
    nameLabel2.foreground = Color.WHITE
    nameLabel2.setBounds(10, 10, 120, 25)
    projectPanel.add(nameLabel2)

    val nameField = JTextField()
    nameField.setBounds(140, 10, 230, 25)
    projectPanel.add(nameField)

    val folderLabel = JLabel("Folder:")
    folderLabel.foreground = Color.WHITE
    folderLabel.setBounds(10, 50, 120, 25)
    projectPanel.add(folderLabel)

    val folderField2 = JTextField()
    folderField2.setBounds(140, 50, 230, 25)
    projectPanel.add(folderField2)

    val browseButton = JButton("Browse")
    browseButton.setBounds(250, 85, 100, 25)
    projectPanel.add(browseButton)

    val createButton = JButton("Create")
    createButton.setBounds(140, 85, 100, 25)
    projectPanel.add(createButton)

    frame.add(projectPanel)
    
    val button = JButton("New Project")
    button.background = Color(0, 0, 0)
    button.foreground = Color.white
    button.border = BorderFactory.createEmptyBorder()
    button.isFocusPainted = false
    button.setBounds(10, 10, 185, 50)

    button.font = try {
        Font("JetBrains Mono", Font.PLAIN, 17)
    } catch (e: Exception) {
        e.printStackTrace()
        Font("Serif", Font.PLAIN, 17)
    }
    
    frame.add(button)
    
    button.addActionListener {
        println("A project is being created.")
        projectPanel.isVisible = !projectPanel.isVisible
    }

    frame.contentPane.background = Color(30, 30, 30)
    frame.isVisible = true
}
