FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# Thêm patch vào SRC_URI
SRC_URI += "file://0001-Add-mgpio-module-for-controlling-LED-on-GPIO27.patch"
SRC_URI += "file://0001-Add-ssd1306-driver-for-controlling-OLED-0.96-I2C.patch"

# Nếu bạn muốn module tự động tải khi khởi động
KERNEL_MODULE_AUTOLOAD += "mgpio"
KERNEL_MODULE_AUTOLOAD += "ssd1306"

