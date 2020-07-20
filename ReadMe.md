
# Installation
```sudo apt-get install libc6:i386 libncurses5:i386 libstdc++6:i386 lib32z1 libbz2-1.0:i386```

# Emu

Unable to connect to abd daemon

cd /home/z/Android/Sdk/emulator
../../Sdk/platform-tools/adb start-server

/home/z/Android/Sdk/platform-tools/adb start-server



https://developer.android.com/studio/run/emulator-commandline

./emulator -list-avds

Pixel_2_API_30

./emulator -avd Pixel_2_API_30 -memory 1024 -noaudio -screen no-touch -no-accel -no-boot-anim
Segfault

2048
segfault


# KVM
(!!!)https://developer.android.com/studio/run/emulator-acceleration?utm_source=android-studio#vm-linux

https://www.cyberciti.biz/faq/installing-kvm-on-ubuntu-16-04-lts-server/

```sudo apt-get install qemu-kvm libvirt-bin virtinst bridge-utils cpu-checker```

https://help.ubuntu.com/community/KVM/Installation


#  HW accel
https://developer.android.com/studio/run/emulator-acceleration
-no-accel 
-screen no-touch

Best:
```./emulator -avd Pixel_2_XL_API_26 -gpu host -memory 1024 -noaudio  -no-boot-anim```
```./emulator -avd Pixel_2_XL_API_26 -gpu host -memory 1024```


d AV.. Manager можно ограничить тоже

./emulator  -accel-check

emulator: WARNING: x86 emulation may not work without hardware acceleration!

sudo apt-get install qemu-kvm libvirt-bin ubuntu-vm-builder bridge-utils 
sudo apt-get install ia32-libs-multiarch

https://askubuntu.com/questions/107230/what-happened-to-the-ia32-libs-package
sudo apt-get install ia32-libs-multiarch:i386

Kill system:
```./emulator -avd Pixel_2_API_30 -gpu host -memory 1024 -noaudio  -no-boot-anim```


# PC

RAM

sudo lshw -C memory 

code 
```
*-bank:3
description: DIMM DDR3 Synchronous Unbuffered (Unregistered) 1600 MHz (0.6 ns)
product: CL11-11-11 D3-1600
vendor: A1_Manufacturer3
physical id: 3
serial: 00000000
slot: DIMM 1
size: 4GiB
width: 64 bits
clock: 1600MHz (0.6ns)
```


# Errors
https://stackoverflow.com/questions/61839898/android-emulator-gives-an-error-so-reuseport-and-debugging-not-working

# Nvidia

[GeForce GT 740]

https://www.linuxbabe.com/ubuntu/install-nvidia-driver-ubuntu-18-04


# Activity

# Service
Как обращаться то?

# Broadcast receivers

# ContentProvider
- доступ к диску?

# Fragment

A Fragment is a piece of an activity which enable more modular activity design. It will not be wrong if we say, a fragment is a kind of sub-activity.

# Views


# Network???

https://stackoverflow.com/questions/24399294/android-asynctask-to-make-an-http-get-request
AsyncTask - strange really, может либу добавить?

OkHttp
https://www.vogella.com/tutorials/JavaLibrary-OkHttp/article.html

https://developer.android.com/training/volley

# Native vs Cross

https://xakep.ru/2017/12/25/crossplatform-myths/

# Верстка

https://qna.habr.com/q/257433

# Http access
10.0.2.2

https://stackoverflow.com/questions/45940861/android-8-cleartext-http-traffic-not-permitted

# Kotlin

https://stackoverflow.com/questions/45025758/how-to-use-kotlin-in-an-existing-android-app
добавли скрипт, потом плагин предложила поставить

autoconfig is failed