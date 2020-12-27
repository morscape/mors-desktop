import frida, sys, sys, os

def on_message(message, data):
    if message['type'] == 'send':
        print("[*] {0}".format(message['payload']))
    else:
        print(message)

# with open(os.path.dirname(os.path.realpath(__file__)) + '/idlenotifier.js') as f:
with open(os.path.dirname(os.path.realpath(__file__)) + '/perspective.compiled.js') as f:
    jscode = f.read()
f.close()


process = frida.get_usb_device(1).attach('com.jagex.oldscape.android')
# device = frida.get_usb_device(1)
# p_address = device.spawn(['com.jagex.oldscape.android'])
# process = device.attach(p_address)
script = process.create_script(jscode)
script.on('message', on_message)
print('[*] Running CTF')
script.load()
sys.stdin.read()
