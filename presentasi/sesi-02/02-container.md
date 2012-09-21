% Java Desktop - Container
% Endy Muhardin <endy.muhardin@gmail.com>
% 14 September 2012

# Berbagai Jenis Container #
- Window
- Frame
- Dialog
- Internal Frame
- Panel

# Frame #
- Memiliki Title
- Decoration
    - Minimize
    - Maximize
    - Close

# Dialog #
- Memiliki Title
- Decoration hanya close saja
- Memiliki parent
- Modality
    - Blocking (modal)
    - Non blocking (non modal)
    - Diatur dengan `setModal`

# Internal Frame #
- Digunakan untuk membuat frame di dalam frame
- Berada di dalam Desktop Pane
- Desktop Pane berada di dalam Frame
    
# Panel #
- Tidak memiliki decoration
- Berada di dalam Frame atau Dialog
- Digunakan untuk mengelompokkan komponen

# Class #
- Frame : `javax.swing.JFrame`
- Dialog : `javax.swing.JDialog`
- Panel : `javax.swing.JPanel`

# Membuat Frame #
- Instankan JFrame
- Atur size dengan `setSize`
- Atur title dengan `setTitle`
- Posisikan di tengah dengan `setLocationRelativeTo`
- Kalau diclose, terminate aplikasi `setDefaultCloseOperation`
- Tampilkan dengan `setVisible`
- Menghilangkan decoration `setUndecorated`
