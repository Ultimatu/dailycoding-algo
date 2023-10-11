class BinaryTree:
    class Node:
        def __init__(self, value):
            self.value = value
            self.left = None
            self.right = None

    def __init__(self):
        self.root = None

    def invert(self):
        self._invert(self.root)

    def _invert(self, node):
        if node is None:
            return

        node.left, node.right = node.right, node.left

        self._invert(node.left)
        self._invert(node.right)